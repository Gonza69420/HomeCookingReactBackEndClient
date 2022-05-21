package com.homecooking.demo.data.service.serviceinteface;

import com.homecooking.demo.data.entity.Chef;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

public interface ChefService {
 void save(Chef chef);
 void update(Chef chef);
 void delete(UUID id);
 Optional<Chef> getChefById(UUID id);
}
