package ru.sbulygin;

/**
* Класс Paint.
* @author sbulygin.
* @since 29.11.2016.
* @version 1.0.
*/
public class Paint {

    /**
	* Метод pyramid.
    * Строит пирамиду в высоту height.
	* @param height заданная высота пирамиды.
	* @return возвращает строку, содержащую пирамиду.
	*/
    public String pyramid(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Piramida cannot have height less or equal to 0.");
        }
        StringBuilder pyramid = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int l = 0; l < height - i; l++) {
                pyramid.append(" ");
            }
            for (int m = 0; m < i * 2 + 1; m++) {
                if (m % 2 == 0) {
                    pyramid.append("^");
                } else {
                    pyramid.append(" ");
                }
            }
            for (int r = 0; r < height - i; r++) {
                pyramid.append(" ");
            }
           pyramid.append("\r\n");
        }
        return pyramid.toString();
    }
 }