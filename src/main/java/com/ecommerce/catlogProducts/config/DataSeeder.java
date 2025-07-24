package com.ecommerce.catlogProducts.config;


import com.ecommerce.catlogProducts.model.Category;
import com.ecommerce.catlogProducts.model.Product;
import com.ecommerce.catlogProducts.repository.CategoryRepository;
import com.ecommerce.catlogProducts.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//implemented commandLineRunner to add products and categories in db,
// once the spring boot application runs,
// the code in run method will gets executed.
@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        // delete all the existing data

        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // add categories data

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category fashion = new Category();
        fashion.setName("Fashion");

        Category books = new Category();
        books.setName("Books");

        Category homeAppliances = new Category();
        homeAppliances.setName("Home Appliances");

        Category sports = new Category();
        sports.setName("Sports & Outdoors");

        Category beauty = new Category();
        beauty.setName("Beauty & Personal Care");

        Category toys = new Category();
        toys.setName("Toys & Games");

        Category automotive = new Category();
        automotive.setName("Automotive");

        Category groceries = new Category();
        groceries.setName("Groceries");

        Category furniture = new Category();
        furniture.setName("Furniture");

        Category petSupplies = new Category();
        petSupplies.setName("Pet Supplies");

        categoryRepository.saveAll(Arrays.asList(
                electronics,
                fashion,
                books,
                homeAppliances,
                sports,
                beauty,
                toys,
                automotive,
                groceries,
                furniture,
                petSupplies
        ));


        //adding products for the categories

        List<Product> products = new ArrayList<>();

// Placeholder image URL
        String imageUrl = "https://placehold.co/600x400";

// Electronics
        Product laptop = new Product();
        laptop.setName("HP Pavilion");
        laptop.setDescription("RTX, 8 GB RAM, Intel i7");
        laptop.setImageURL(imageUrl);
        laptop.setPrice(70000.0);
        laptop.setCategory(electronics);
        products.add(laptop);

        Product smartphone = new Product();
        smartphone.setName("Samsung Galaxy S21");
        smartphone.setDescription("128GB, 8GB RAM, 5G");
        smartphone.setImageURL(imageUrl);
        smartphone.setPrice(50000.0);
        smartphone.setCategory(electronics);
        products.add(smartphone);

// Fashion
        Product tshirt = new Product();
        tshirt.setName("Levi's T-Shirt");
        tshirt.setDescription("100% Cotton, Size M");
        tshirt.setImageURL(imageUrl);
        tshirt.setPrice(1200.0);
        tshirt.setCategory(fashion);
        products.add(tshirt);

        Product jeans = new Product();
        jeans.setName("Wrangler Jeans");
        jeans.setDescription("Slim Fit, Dark Blue");
        jeans.setImageURL(imageUrl);
        jeans.setPrice(2200.0);
        jeans.setCategory(fashion);
        products.add(jeans);

// Books
        Product novel = new Product();
        novel.setName("The Alchemist");
        novel.setDescription("By Paulo Coelho");
        novel.setImageURL(imageUrl);
        novel.setPrice(350.0);
        novel.setCategory(books);
        products.add(novel);

        Product textbook = new Product();
        textbook.setName("Java Programming");
        textbook.setDescription("Complete Reference, 11th Edition");
        textbook.setImageURL(imageUrl);
        textbook.setPrice(950.0);
        textbook.setCategory(books);
        products.add(textbook);

// Home Appliances
        Product blender = new Product();
        blender.setName("Philips Blender");
        blender.setDescription("600W, 1.5L Jar");
        blender.setImageURL(imageUrl);
        blender.setPrice(3000.0);
        blender.setCategory(homeAppliances);
        products.add(blender);

        Product microwave = new Product();
        microwave.setName("IFB Microwave Oven");
        microwave.setDescription("20 Litre, Convection");
        microwave.setImageURL(imageUrl);
        microwave.setPrice(7500.0);
        microwave.setCategory(homeAppliances);
        products.add(microwave);

// Sports & Outdoors
        Product football = new Product();
        football.setName("Nivia Football");
        football.setDescription("Size 5, Synthetic Leather");
        football.setImageURL(imageUrl);
        football.setPrice(800.0);
        football.setCategory(sports);
        products.add(football);

        Product yogaMat = new Product();
        yogaMat.setName("Reebok Yoga Mat");
        yogaMat.setDescription("6mm Thick, Non-Slip");
        yogaMat.setImageURL(imageUrl);
        yogaMat.setPrice(1200.0);
        yogaMat.setCategory(sports);
        products.add(yogaMat);

// Beauty & Personal Care
        Product shampoo = new Product();
        shampoo.setName("Dove Shampoo");
        shampoo.setDescription("Hair Fall Rescue, 340ml");
        shampoo.setImageURL(imageUrl);
        shampoo.setPrice(300.0);
        shampoo.setCategory(beauty);
        products.add(shampoo);

        Product faceCream = new Product();
        faceCream.setName("Nivea Face Cream");
        faceCream.setDescription("Moisturizing, 100ml");
        faceCream.setImageURL(imageUrl);
        faceCream.setPrice(250.0);
        faceCream.setCategory(beauty);
        products.add(faceCream);

// Toys & Games
        Product lego = new Product();
        lego.setName("LEGO Classic Set");
        lego.setDescription("Creative Bricks, 500+ pieces");
        lego.setImageURL(imageUrl);
        lego.setPrice(2800.0);
        lego.setCategory(toys);
        products.add(lego);

        Product puzzle = new Product();
        puzzle.setName("Jigsaw Puzzle");
        puzzle.setDescription("1000 pieces, Landscape");
        puzzle.setImageURL(imageUrl);
        puzzle.setPrice(500.0);
        puzzle.setCategory(toys);
        products.add(puzzle);

// Automotive
        Product carWax = new Product();
        carWax.setName("3M Car Wax");
        carWax.setDescription("200ml, High Gloss");
        carWax.setImageURL(imageUrl);
        carWax.setPrice(450.0);
        carWax.setCategory(automotive);
        products.add(carWax);

        Product seatCover = new Product();
        seatCover.setName("Car Seat Cover");
        seatCover.setDescription("Universal Fit, Black");
        seatCover.setImageURL(imageUrl);
        seatCover.setPrice(2000.0);
        seatCover.setCategory(automotive);
        products.add(seatCover);

// Groceries
        Product rice = new Product();
        rice.setName("Basmati Rice");
        rice.setDescription("5kg, Premium Quality");
        rice.setImageURL(imageUrl);
        rice.setPrice(450.0);
        rice.setCategory(groceries);
        products.add(rice);

        Product cookingOil = new Product();
        cookingOil.setName("Sunflower Oil");
        cookingOil.setDescription("1L, Refined");
        cookingOil.setImageURL(imageUrl);
        cookingOil.setPrice(150.0);
        cookingOil.setCategory(groceries);
        products.add(cookingOil);

// Furniture
        Product chair = new Product();
        chair.setName("Office Chair");
        chair.setDescription("Ergonomic, Adjustable Height");
        chair.setImageURL(imageUrl);
        chair.setPrice(3500.0);
        chair.setCategory(furniture);
        products.add(chair);

        Product table = new Product();
        table.setName("Study Table");
        table.setDescription("Wooden, 4ft x 2ft");
        table.setImageURL(imageUrl);
        table.setPrice(4500.0);
        table.setCategory(furniture);
        products.add(table);

// Pet Supplies
        Product dogFood = new Product();
        dogFood.setName("Pedigree Dog Food");
        dogFood.setDescription("Chicken, 3kg");
        dogFood.setImageURL(imageUrl);
        dogFood.setPrice(950.0);
        dogFood.setCategory(petSupplies);
        products.add(dogFood);

        Product catToy = new Product();
        catToy.setName("Cat Teaser Toy");
        catToy.setDescription("Interactive, Feather Wand");
        catToy.setImageURL(imageUrl);
        catToy.setPrice(300.0);
        catToy.setCategory(petSupplies);
        products.add(catToy);

// Save all products
        productRepository.saveAll(products);



    }
}
