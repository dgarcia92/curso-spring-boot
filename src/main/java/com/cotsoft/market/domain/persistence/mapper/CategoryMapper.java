package com.cotsoft.market.domain.persistence.mapper;

import com.cotsoft.market.domain.Category;
import com.cotsoft.market.domain.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration   //Para hacer el mapeo inverso de lo que declarmos arriba (ya no es necesario mapearlo a mano)
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
