package belajar.Models.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import belajar.Models.Entity.Produk;

public interface ProdukRepo extends CrudRepository<Produk, Long> {
    List<Produk> findByNameContains(String name);
}
