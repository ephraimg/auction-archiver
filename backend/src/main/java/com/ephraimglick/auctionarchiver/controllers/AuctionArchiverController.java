package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.AuctionItem;
import com.ephraimglick.auctionarchiver.models.AuctionItemPagedCollection;
import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import com.ephraimglick.auctionarchiver.repositories.AuctionItemRepository;
import com.ephraimglick.auctionarchiver.services.AuctionArchiverEbayService;
import com.ephraimglick.auctionarchiver.utils.Converters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;
import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.AUCTION_ITEMS;

@RestController
public class AuctionArchiverController implements AuctionArchiverApi {
    AuctionItemRepository auctionItemRepository;
    Converters converters;

    @Autowired
    public AuctionArchiverController(AuctionItemRepository auctionItemRepository, Converters converters) {
        this.auctionItemRepository = auctionItemRepository;
        this.converters = converters;
    }
    private final AuctionArchiverEbayService eBayService = new AuctionArchiverEbayService();

    @GetMapping(SEARCH)
    public AuctionItemPagedCollection search(@RequestParam String q) {
        eBayService.getToken();
        EbaySearchPagedItemSummariesCollection results = eBayService.searchItemSummaries(q);
        return converters.convertCollection(results);
    }

    @GetMapping(AUCTION_ITEMS)
    public List<AuctionItem> listArchivedItems() {
        return auctionItemRepository.findAll();
    }

    @PostMapping(AUCTION_ITEMS)
    public ResponseEntity<?> archiveItem(@RequestBody AuctionItem auctionItem) {
        auctionItemRepository.save(auctionItem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleException(Exception exception) {
        System.out.println("Error: " + exception.getClass());
        System.out.println(exception.getMessage());
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}
