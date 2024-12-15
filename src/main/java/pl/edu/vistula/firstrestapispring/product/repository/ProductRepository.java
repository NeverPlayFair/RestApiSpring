package pl.edu.vistula.firstrestapispring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapispring.product.domain.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository {

    private final Map<Long, Product> map = new HashMap<>();
    private long counter = 1;

    public Product save(Product entity) {
        entity.setId(counter);
        map.put(counter, entity);
        counter++;
        return entity;
    }

    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }
}
