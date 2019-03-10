public class TemperatureConverter {

    public static String convertTemp(int temperature, char convertTo){
        int convertTemperature;
        String convertTemp = "0";
        switch (convertTo){
            case 'F':
                convertTemperature = (temperature-32)*5/9;
                convertTemp = "Вы ввели градусов - " + temperature + " по " + convertTo + " (Фаренгейту). По Цельсию это - " + convertTemperature + " C";
                break;
            case 'C':
                convertTemperature = (temperature*5/9)+32;
                convertTemp = "Вы ввели градусов - " + temperature + " по " + convertTo + " (Цельсию). По Фаренгейту это - " + convertTemperature + " F";
                break;
        }
        return convertTemp;
    }
}
