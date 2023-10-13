package com.ephraimglick.auctionarchiver.repositories;

import com.ephraimglick.auctionarchiver.models.AuctionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuctionItemRepository extends JpaRepository<AuctionItem, UUID> {
}
