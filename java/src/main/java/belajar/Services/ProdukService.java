package belajar.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import belajar.Models.Entity.Produk;
import belajar.Models.Repos.ProdukRepo;

@Service
@Transactional
public class ProdukService {

    @Autowired
    private ProdukRepo produkRepo;

    public Produk save(Produk produk) {
        return produkRepo.save(produk);
    }

    public Produk findOne(Long id) {
        Optional<Produk> produk = produkRepo.findById(id);
        if (!produk.isPresent()) {
            return null;
        }
        return produk.get();
    }

    public Iterable<Produk> findAll() {
        return produkRepo.findAll();
    }

    public void removeOne(Long id) {
        produkRepo.deleteById(id);
    }

    public List<Produk> findByName(String name) {
        return produkRepo.findByNameContains(name);
    }
}
