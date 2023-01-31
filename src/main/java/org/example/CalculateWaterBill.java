package org.example;

/**
 * Hello world!
 *
 */
public class CalculateWaterBill
{

    public static double calculateWaterBill(double gallonUsage){
        double minimumWaterBill =18.84;
        double numberOfGallonsInCCF = 748;
        double includeGallons = 2* numberOfGallonsInCCF;

        if (gallonUsage <= includeGallons){
            return minimumWaterBill;
        } else {
            double extraGallonUsed = gallonUsage - includeGallons;
            double extraAmountOwned = Math.ceil(extraGallonUsed/numberOfGallonsInCCF)*3.9;
            return minimumWaterBill + extraAmountOwned;
        }
    }
    public static void main( String[] args )
    {
        System.out.println(CalculateWaterBill.calculateWaterBill(1500));
    }
}
