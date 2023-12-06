package com.microservice.prices.infrastructure.rest.mapper;

import com.microservice.prices.domain.model.BrandId;
import com.microservice.prices.domain.model.Price;
import com.microservice.prices.domain.model.PriceList;
import com.microservice.prices.domain.model.ProductId;
import com.microservice.prices.infrastructure.rest.dto.PriceResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-30T12:58:37+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class PriceDtoMapperImpl implements PriceDtoMapper {

    @Override
    public PriceResponseDto toDto(Price prop) {
        if ( prop == null ) {
            return null;
        }

        PriceResponseDto priceResponseDto = new PriceResponseDto();

        priceResponseDto.setProductId( propProductIdId( prop ) );
        priceResponseDto.setBrandId( propBrandIdId( prop ) );
        priceResponseDto.setPriceList( propPriceListId( prop ) );
        priceResponseDto.setStartDate( prop.getStartDate() );
        priceResponseDto.setEndDate( prop.getEndDate() );
        priceResponseDto.setPrice( prop.getPrice() );

        return priceResponseDto;
    }

    private Long propProductIdId(Price price) {
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

    private Long propBrandIdId(Price price) {
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

    private Long propPriceListId(Price price) {
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
}
