package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Corn Chip Salad","Ingredients\n" +
                "\n" +
                "Meat:\n" +
                "1 lb Ground beef\n" +
                "\n" +
                "Produce:\n" +
                "2 (15 ounce) cans Kidney beans\n" +
                "1 large head lettuce\n" +
                "1 Onion, large\n" +
                "1 1/2 cups Tomatoes\n" +
                "\n" +
                "Condiments:\n" +
                "8 oz Thousand island salad dressing\n" +
                "\n" +
                "Snacks:\n" +
                "1 (16 ounce) package Corn chips\n" +
                "\n" +
                "Dairy:\n" +
                "1 1/2 cups Cheddar cheese, sharp\n" +
                "1/2 cup Monterey jack cheese ","Directions:",
                "Corn chips give a special crunch and an unexpected flavor to this potluck favorite. Bacon adds a hint of smokiness, while the cranberries bring touch of sweetness. It's the perfect picnic companion!\n" +
                        "\n" +
                        "Directions:\n" +
                        "1. For dressing, place first 7 ingredients in a blender.\n" +
                        "Cover; process until smooth.\n" +
                        "Stir in poppy seeds.\n" +
                        "\n" +
                        "2. Place salad ingredients in a large bowl; toss with dressing.\n" +
                        "Serve immediately.\n" +
                        "\n" +
                        "\n" +
                        "NUTRITION FACTS:\n" +
                        "\n" +
                        "1 1/3 cups: \n" +
                        "436 calories\n" +
                        "30g fat (4g saturated fat)\n" +
                        "12mg cholesterol\n" +
                        "456mg sodium\n" +
                        "38g carbohydrate (24g sugars, 2g fiber)\n" +
                        "7g protein\n" +
                        " ",R.drawable.cornchipsalad));

        recipes1.add(new Recipes("Taco Salad with Lime Vinegar Dressing","Ingredients\n" +
                "\n" +
                "Meat:\n" +
                "1 lb Ground beef, lean\n" +
                "\n" +
                "Produce:\n" +
                "1 (10 ounce) basket grape tomatoes\n" +
                "1 Avocado, pitted and sliced\n" +
                "1/2 cup Carrots\n" +
                "1/2 cup Celery\n" +
                "2 tbsp Cilantro, fresh\n" +
                "3 cloves Garlic\n" +
                "1/2 cup Green bell pepper\n" +
                "1 (15 ounce) can Kidney beans\n" +
                "1 head Romaine lettuce\n" +
                "\n" +
                "Condiments:\n" +
                "2 tbsp Dijon mustard\n" +
                "3 tbsp Honey\n" +
                "1/4 cup Lime juice\n" +
                "\n" +
                "Baking and Spices:\n" +
                "1 salt and ground black pepper\n" +
                "1 (1 ounce) packet Taco seasoning mix\n" +
                "\n" +
                "Oil and Vinegars:\n" +
                "2 tbsp Champagne vinegar\n" +
                "\n" +
                "Dairy:\n" +
                "1/4 cup Cheddar cheese\n" +
                "\n" +
                "Liquids:\n" +
                "3/4 cup Water ","Instructions:","1. Heat a grill pan (or heavy skillet) over medium-high heat.\n" +
                "\n" +
                "2. In a medium-size mixing bowl combine chicken tenders with olive oil, lime juice, chili powder, cumin, onion powder, garlic powder, and cayenne pepper.\n" +
                "\n" +
                "3. Cook chicken in grill pan until cooked through, about 2-3 minutes per side.\n" +
                "\n" +
                "4. Make your cilantro lime vinegar by placing cilantro into a food processor or blender.\n" +
                "\n" +
                "5. Put rinsed salad greens into a bowl. Top with bean mixture, corn onion, olives, tomatoes, and avocado. Serve topped with chicken and cilantro-lime vinegar.\n" +
                "\n" +
                "\n" +
                "NUTRITION FACTS:\n" +
                "\n" +
                "Calories: 599kcal\n" +
                "Carbohydrates: 45g\n" +
                "Protein: 36g\n" +
                "Fat: 33g\n" +
                "Saturated Fat: 4g\n" +
                "Cholesterol: 72mg\n" +
                "Sodium: 482mg\n" +
                "Potassium: 1475mg\n" +
                "Fiber: 13g\n" +
                "Sugar: 3g\n" +
                "Vitamin A: 2025IU\n" +
                "Vitamin C: 51mg\n" +
                "Calcium: 75mg\n" +
                "Iron: 5mg",R.drawable.tacowithlimedressing));
        recipes1.add(new Recipes("Tuna and Peas","Ingredients\n" +
                "\n" +
                "Seafod:\n" +
                "2 (5 ounce) cans Tuna\n" +
                "\n" +
                "Produce:\n" +
                "1 clove, Garlic\n" +
                "1 Onion, small\n" +
                "1/2 cup Peas, frozen\n" +
                "\n" +
                "Canned Goods:\n" +
                "1 (10.75 ounce) can Cream of mushroom soup\n" +
                "\n" +
                "Baking and Spices:\n" +
                "1 Salt and ground black pepper\n" +
                "\n" +
                "Dairy\n" +
                "1/4 cup Butter\n" +
                "1/2 cup Milk","Directions:",
                "1. Place the tuna into a bowl with the peas, and lightly stir to break up the tuna and combine with the peas. Add the mayonnaise, garlic powder, and pepper, and stir to mix well.\n" +
                        "\n" +
                        "NUTRITION FACTS:\n" +
                        "\n" +
                        "Per Serving:\n" +
                        "103 calories\n" +
                        "Protein:16.7g\n" +
                        "Carbohydrates: 7.1g\n" +
                        "Fat: 0.7g\n" +
                        "Cholesterol: 16.8mg\n" +
                        "Sodium: 159.7mg\n",R.drawable.tunaandpeas));
        recipes1.add(new Recipes("Harissa Egg Salad","Ingredients\n" +
                "\n" +
                "Produce:\n" +
                "1 Avocado, ripe\n" +
                "1 tbsp Cilantro, fresh\n" +
                "3 Radishes, large\n" +
                "1 Spring onion\n" +
                "\n" +
                "Refrigerated:\n" +
                "3 Eggs, hard\n" +
                "\n" +
                "Condiments:\n" +
                "1 tbsp Harissa\n" +
                "1 tsp Lime Juice\n" +
                "1 tbsp Mayonnaise\n" +
                "2 tsp Mustard, spicy brown\n" +
                "\n" +
                "Baking and Spices:\n" +
                "1 tbsp Paprika, smoked\n" +
                "1 Salt and ground black pepper\n" +
                "\n" +
                "Others:\n" +
                "10 Cornichons, chopped","Nutrition Facts:",
                "Calories: 356.8\n" +
                        "Protein: 13g\n" +
                        "Fat: 29.3g\n" +
                        "Carbohydrates: 14.3g",R.drawable.harissaeggsalad));
        recipes1.add(new Recipes("Vegan Alfredo with Veggies","Ingredients\n" +
                "\n" +
                "Produce:\n" +
                "2 cups bottom Mushrooms\n" +
                "2 cloves, Garlic\n" +
                "1 tsp Lemon, zest, or to Taste\n" +
                "1/2 cup Peas and Carrots, frozen\n" +
                "2 cups Spinach, fresh\n" +
                "\n" +
                "Condiments:\n" +
                "1 tbsp Lemon juice\n" +
                "\n" +
                "Pasta and Grains:\n" +
                "1/2 (16 ounce) package Spaghetti, whole Grains\n" +
                "\n" +
                "Baking and Spices:\n" +
                "1/4 cups, all purpose flour\n" +
                "1/4 tsp black pepper, Ground\n" +
                "1/2 tsp Kosher salt \n" +
                "\n" +
                "Oils and Vinegars:\n" +
                "2 tbsp of Olive oil\n" +
                "\n" +
                "Nuts and Seeds:\n" +
                "1/3 cup, Cashews and Unsalted Raw\n" +
                "\n" +
                "Liquids:\n" +
                "1 1/4 cups of Water\n","",
                "",R.drawable.veganalfredowithveggies));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);
    }
}