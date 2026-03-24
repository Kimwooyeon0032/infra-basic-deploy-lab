package com.example.deploylab;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deploylab.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {}
