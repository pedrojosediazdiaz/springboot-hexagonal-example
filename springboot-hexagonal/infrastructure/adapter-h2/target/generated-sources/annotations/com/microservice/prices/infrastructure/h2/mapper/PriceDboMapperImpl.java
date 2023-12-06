package com.microservice.prices.infrastructure.h2.mapper;

import com.microservice.prices.domain.model.BrandId;
import com.microservice.prices.domain.model.BrandId.BrandIdBuilder;
import com.microservice.prices.domain.model.Currency;
import com.microservice.prices.domain.model.Currency.CurrencyBuilder;
import com.microservice.prices.domain.model.Price;
import com.microservice.prices.domain.model.Price.PriceBuilder;
import com.microservice.prices.domain.model.PriceId;
import com.microservice.prices.domain.model.PriceId.PriceIdBuilder;
import com.microservice.prices.domain.model.PriceList;
import com.microservice.prices.domain.model.PriceList.PriceListBuilder;
import com.microservice.prices.domain.model.Priority;
import com.microservice.prices.domain.model.Priority.PriorityBuilder;
import com.microservice.prices.domain.model.ProductId;
import com.microservice.prices.domain.model.ProductId.ProductIdBuilder;
import com.microservice.prices.infrastructure.h2.entity.PriceEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-30T12:58:34+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class PriceDboMapperImpl implements PriceDboMapper {

    @Override
    public PriceEntity toDbo(Price domain) {
        if ( domain == null ) {
            return null;
        }

        PriceEntity priceEntity = new PriceEntity();

        priceEntity.setId( domainPriceIdId( domain ) );
        priceEntity.setBrandId( domainBrandIdId( domain ) );
        priceEntity.setPriceList( domainPriceListId( domain ) );
        priceEntity.setPriority( domainPriorityId( domain ) );
        priceEntity.setCurrency( domainCurCur( domain ) );
        priceEntity.setProductId( domainProductIdId( domain ) );
        priceEntity.setStartDate( domain.getStartDate() );
        priceEntity.setEndDate( domain.getEndDate() );
        priceEntity.setPrice( domain.getPrice() );

        return priceEntity;
    }

    @Override
    public Price toDomain(PriceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PriceBuilder price = Price.builder();

        price.priceId( priceEntityToPriceId( entity ) );
        price.brandId( priceEntityToBrandId( entity ) );
        price.priceList( priceEntityToPriceList( entity ) );
        price.priority( priceEntityToPriority( entity ) );
        price.cur( priceEntityToCurrency( entity ) );
        price.productId( priceEntityToProductId( entity ) );
        price.startDate( entity.getStartDate() );
        price.endDate( entity.getEndDate() );
        price.price( entity.getPrice() );

        return price.build();
    }

    private Long domainPriceIdId(Price price) {
        if ( price == null ) {
            return null;
        }
        PriceId priceId = price.getPriceId();
        if ( priceId == null ) {
            return null;
        }
        Long id = priceId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long domainBrandIdId(Price price) {
        if ( price == null ) {
            return null;
        }
        BrandId brandId = price.getBrandId();
        if ( brandId == null ) {
            return null;
        }
        Long id = brandId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long domainPriceListId(Price price) {
        if ( price == null ) {
            return null;
        }
        PriceList priceList = price.getPriceList();
        if ( priceList == null ) {
            return null;
        }
        Long id = priceList.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer domainPriorityId(Price price) {
        if ( price == null ) {
            return null;
        }
        Priority priority = price.getPriority();
        if ( priority == null ) {
            return null;
        }
        Integer id = priority.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String domainCurCur(Price price) {
        if ( price == null ) {
            return null;
        }
        Currency cur = price.getCur();
        if ( cur == null ) {
            return null;
        }
        String cur1 = cur.getCur();
        if ( cur1 == null ) {
            return null;
        }
        return cur1;
    }

    private Long domainProductIdId(Price price) {
        if ( price == null ) {
            return null;
        }
        ProductId productId = price.getProductId();
        if ( productId == null ) {
            return null;
        }
        Long id = productId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected PriceId priceEntityToPriceId(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        PriceIdBuilder priceId = PriceId.builder();

        priceId.id( priceEntity.getId() );

        return priceId.build();
    }

    protected BrandId priceEntityToBrandId(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        BrandIdBuilder brandId = BrandId.builder();

        brandId.id( priceEntity.getBrandId() );

        return brandId.build();
    }

    protected PriceList priceEntityToPriceList(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        PriceListBuilder priceList = PriceList.builder();

        priceList.id( priceEntity.getPriceList() );

        return priceList.build();
    }

    protected Priority priceEntityToPriority(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        PriorityBuilder priority = Priority.builder();

        priority.id( priceEntity.getPriority() );

        return priority.build();
    }

    protected Currency priceEntityToCurrency(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        CurrencyBuilder currency = Currency.builder();

        currency.cur( priceEntity.getCurrency() );

        return currency.build();
    }

    protected ProductId priceEntityToProductId(PriceEntity priceEntity) {
        if ( priceEntity == null ) {
            return null;
        }

        ProductIdBuilder productId = ProductId.builder();

        productId.id( priceEntity.getProductId() );

        return productId.build();
    }
}
