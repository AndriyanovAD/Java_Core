package HW2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HW2 {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4){
            throw new MyArraySizeException("Длина массива != 4");
        }
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array.length; j++){
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Высота массива != 4");
                }
            }
        }
        int sum = 0;
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array.length; j++) {
               try {
                   sum += Integer.parseInt(array[i][j]);
               } catch (NumberFormatException e) {
                   throw new MyArrayDataException("В ячейке [ " +  + i + " ][ " + j + " ] нашего массива не число!");
               }
               }
            }
    return sum;
    }

    public static void main(String[] args) {
        String[][] trueArray = {{"1", "2", "3", "4"},{"5", "6", "7", "8"}, {"4","3", "2", "1"}, {"8", "7", "6", "5"}};
    try {
        System.out.println(sumArray(trueArray));
    } catch (MyArraySizeException e) {
        System.out.println(e.getMessage());
    } catch (MyArrayDataException e) {
        System.out.println(e.getMessage());
    }
        String[][] falseArray = {{"1", "2", "3", "4"},{"5", "6", "7", "8"}, {"4","3a", "2", "1"}, {"8", "7", "6", "5"}};
    try {
        System.out.println(sumArray(falseArray));
    } catch (MyArraySizeException e) {
        System.out.println(e.getMessage());
    } catch (MyArrayDataException e) {
        System.out.println(e.getMessage());
    }
    }

}

