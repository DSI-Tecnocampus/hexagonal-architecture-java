package eu.happycoders.shop.adapter.out.persistence.mongo;

import eu.happycoders.shop.adapter.out.persistence.AbstractProductRepositoryTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest
@ActiveProfiles("test-with-mongodb")
class MongoDBProductRepositoryTest extends AbstractProductRepositoryTest {

    @DynamicPropertySource
    static void mongoDbProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.data.mongodb.uri", () -> MongoDBTestContainerConfig.getInstance().getReplicaSetUrl());
    }
}