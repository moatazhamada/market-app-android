package com.bit68.marketapp.data.models;

import java.util.List;

public class Categories {

        private String name;

        private String id;

        private String category_img;

        private List<Product> products;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getCategory_img ()
        {
            return category_img;
        }

        public void setCategory_img (String category_img)
        {
            this.category_img = category_img;
        }

        public List<Product> getProducts ()
        {
            return products;
        }

        public void setProducts (List<Product> products)
        {
            this.products = products;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", id = "+id+", category_img = "+category_img+", products = "+products+"]";
        }

}
