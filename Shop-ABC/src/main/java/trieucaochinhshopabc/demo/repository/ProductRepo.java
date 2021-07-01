package trieucaochinhshopabc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trieucaochinhshopabc.demo.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
