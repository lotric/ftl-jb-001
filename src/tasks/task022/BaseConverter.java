package tasks.task022;

interface Converter {

    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

class ReaumurConverter implements Converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 0.8;
    }
}

class NewtonConverter implements Converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return 0.33 * baseValue;
    }
}

class HookConverter implements Converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return 2.4 * baseValue;
    }
}

public class BaseConverter{

    public static void main(String[] args){

        double T = 24.3;

        System.out.println("Температура по Цельсию: " + new CelsiusConverter().getConvertedValue(T));
        System.out.println("Температура по Кельвину: " + new KelvinConverter().getConvertedValue(T));
        System.out.println("Температура по Фаренгейту: " + new FahrenheitConverter().getConvertedValue(T));
        System.out.println("Температура по Реомюру: " + new ReaumurConverter().getConvertedValue(T));
        System.out.println("Температура по Ньютону: " + new NewtonConverter().getConvertedValue(T));
        System.out.println("Температура по Гуку: " + new HookConverter().getConvertedValue(T));
    }
}