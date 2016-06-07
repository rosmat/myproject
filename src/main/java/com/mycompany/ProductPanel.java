package com.mycompany;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

@SuppressWarnings("serial")
public class ProductPanel extends Panel {

    public ProductPanel(String id, Product product) {
        super(id);

        WebComponent img = new WebComponent("image");
        String imgUrl = product.getName() + ".png";
        img.add(AttributeModifier.replace("src", imgUrl));
        img.add(AttributeModifier.replace("height", 20));
        img.add(AttributeModifier.replace("width", 20));
        add(img);

        Label nameLabel = new Label("productname", product.getName());
        add(nameLabel);

        Label priceLabel = new Label("price", Model.of(product.getPrice()));
        add(priceLabel);
    }

}
