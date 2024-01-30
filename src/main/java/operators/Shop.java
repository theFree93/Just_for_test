package operators;

import enums.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.StreamManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static enums.Products.*;

public class Shop {
    private static final Logger LOGGER = LoggerFactory.getLogger(Shop.class);
    private static final String COMMA_SEPARATOR = ",";

    private static Map<Products, Double> initializeProducts() {
        LOGGER.info("adding products and their prices");
        Map<Products, Double> productsAndCost = new HashMap<>();
        productsAndCost.put(SALAD, SALAD.getCost());
        productsAndCost.put(POTATOES, POTATOES.getCost());
        productsAndCost.put(SPARKLING_WATER, SPARKLING_WATER.getCost());
        return productsAndCost;
    }

    public void processPurchase() {
        LOGGER.info("Processing purchase");
        printProducts();
        List<String> listOfProducts = getProductsFromUser();
        double totalCost = calculateTotalCost(listOfProducts);
        processPayment(totalCost);
    }

    private void printProducts() {
        LOGGER.info("display the product list and price on the screen");
        for (Map.Entry<Products, Double> productAndCost : initializeProducts().entrySet()) {
            System.out.println(productAndCost.getKey() + " - " + productAndCost.getValue());
        }
    }

    private List<String> getProductsFromUser() {
        LOGGER.info("Getting list of products from user");
        System.out.println("Enter the names of the products you need, separated by commas");
        try (BufferedReader nameOfProductsReader = StreamManager.getBufferedReader()) {
            return Arrays.asList(nameOfProductsReader.readLine().split(COMMA_SEPARATOR));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private double calculateTotalCost(List<String> listOfProducts) {
        LOGGER.info("Calculation of the total cost of products based on the entered product list");
        double totalCost = 0;
        for (String productName : listOfProducts) {
            productName = productName.trim();
            Products product = Products.valueOf(productName.toUpperCase());
            if (initializeProducts().containsKey(product)) {
                totalCost += initializeProducts().get(product);
            } else {
                System.out.println("Product " + product + " not found.");
            }
        }
        return totalCost;
    }

    private void processPayment(double totalCost) {
        LOGGER.info("Calculating whether the customer has enough money for the purchase or the need to give change");
        System.out.println("Enter the amount of money");
        try (BufferedReader amountOfMoneyReader = StreamManager.getBufferedReader()) {
            double amountOfMoney = Double.parseDouble(amountOfMoneyReader.readLine());
            if (amountOfMoney >= totalCost) {
                System.out.println("Purchase successful.");
                if (amountOfMoney > totalCost) {
                    System.out.println("Your change is " + (amountOfMoney - totalCost));
                }
            } else {
                System.out.println("You don't have enough money.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}