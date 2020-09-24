public class FinalPriceSpecialDiscount {

    public static void main(String[] args) {

//        https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
//        1475. Final Prices With a Special Discount in a Shop
//        Input: prices = [8,4,6,2,3]
//        Output: [4,2,4,2,3]
//        Explanation:
//        For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
//        For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
//        For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
//        For items 3 and 4 you will not receive any discount at all.

        int[] given = {4,7,1,9,4,8,8,9,4};
        int[] specialPrice = new int[given.length];

        int compareIndex = 1;

        for (int i = 0; i < given.length; i++) {

            // 더이상 비교할거 없을 때 처리
            if (i == given.length-1 || given.length <= compareIndex) {
                specialPrice[i] = given[i];
                compareIndex = i + 2;
                continue;
            }

            if (given[i] < given[compareIndex]) {
                i--;
                compareIndex++;
            } else {
                specialPrice[i] = given[i] - given[compareIndex];
                compareIndex = i + 2;
            }
        }

        for (int a : specialPrice) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
