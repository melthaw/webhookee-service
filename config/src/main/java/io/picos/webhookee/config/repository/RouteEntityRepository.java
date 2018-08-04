package io.picos.webhookee.config.repository;

import io.picos.webhookee.config.model.RouteEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @auther dz
 */
@Repository
public interface RouteEntityRepository extends PagingAndSortingRepository<RouteEntity, String> {

    /**
     * Finds the individual record by the external facing id. This is used
     * instead of findOne, which finds based on the database id.
     *
     * @param id The Externally facing ID
     * @return the matching record
     */
    RouteEntity findById(String id);

}
