package com.ephraimglick.auctionarchiver.controllers;

import com.ephraimglick.auctionarchiver.models.AuctionItem;
import com.ephraimglick.auctionarchiver.models.EbayItemSummary;
import com.ephraimglick.auctionarchiver.models.EbaySearchPagedItemSummariesCollection;
import com.ephraimglick.auctionarchiver.repositories.AuctionItemRepository;
import com.ephraimglick.auctionarchiver.services.AuctionArchiverEbayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.SEARCH;
import static com.ephraimglick.auctionarchiver.constants.Constants.Uri.AUCTION_ITEMS;

@RestController
public class AuctionArchiverController implements AuctionArchiverApi {
    AuctionItemRepository auctionItemRepository;

    @Autowired
    public AuctionArchiverController(AuctionItemRepository auctionItemRepository) {
        this.auctionItemRepository = auctionItemRepository;
    }
    private final AuctionArchiverEbayService eBayService = new AuctionArchiverEbayService();

    @GetMapping(SEARCH)
    public EbaySearchPagedItemSummariesCollection search(@RequestParam String q) {
        eBayService.getToken();
        return eBayService.searchItemSummaries(q);
    }

    @PostMapping(AUCTION_ITEMS)
    public ResponseEntity<?> archiveItem(@RequestBody EbayItemSummary itemSummary) {
        AuctionItem auctionItem = new AuctionItem(itemSummary);
        try {
            auctionItemRepository.save(auctionItem);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass());
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
