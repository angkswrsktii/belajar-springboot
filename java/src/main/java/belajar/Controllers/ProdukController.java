package belajar.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import belajar.Models.Entity.Produk;
import belajar.Services.ProdukService;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {
    @Autowired
    private ProdukService produkService;

    @PostMapping
    public Produk create(@RequestBody Produk produk) {
        return produkService.save(produk);
    }

    @GetMapping
    public Iterable<Produk> findAll() {
        return produkService.findAll();
    }

    @GetMapping("/{id}")
    public Produk findOne(@PathVariable("id") Long id) {
        return produkService.findOne(id);
    }

    @PutMapping
    public Produk update(@RequestBody Produk produk) {
        return produkService.save(produk);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        produkService.removeOne(id);
    }
}
