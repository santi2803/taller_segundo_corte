public class Validations<T> {

    /* public T suma(T a, T b) {
        T suma;
        if (a instanceof Number && b instanceof Number) {
            suma = (Integer.parseInt(a.toString()) + Integer.parseInt(b.toString()));
        }
        return suma;
    } */
    
    public <T extends Number> Integer sumarN(T pVr1, T pVr2) {
        int sum = 0;

        if (pVr1 instanceof Number && pVr2 instanceof Number) {
            sum = pVr1.intValue() + pVr2.intValue();
        }

        return sum;
    }

    public <T extends Number> Integer restaN(T a, T b) {
        int rest = 0;

        if (a instanceof Number && b instanceof Number) {
            rest = a.intValue() - b.intValue();
        }

        return rest;
    }

    public <T extends Number> Integer compN(T pVr1, T pVr2) {
        int result = 0;

        if (pVr1 instanceof Number && pVr2 instanceof Number) {
            if (pVr1.intValue() > pVr2.intValue()) {
                result = pVr1.intValue();
            }
    
            if (pVr1.intValue() < pVr2.intValue()) {
                result = pVr2.intValue();
            }
        }

        return result;
    }

    public <T extends String> String compS(T val1, T val2) {
        String result = "";

        if (val1 instanceof String && val2 instanceof String) {
            if (val1.toString().length() > val2.toString().length()) {
                result = val1;
            }

            if (val1.toString().length() < val2.toString().length()) {
                result = val2;
            }
        }

        return result;
    }

    public <T extends String> String sumS(T pVr1, T pVr2) {

        String sum = "";

        if (pVr1 instanceof String && pVr2 instanceof String) {
            sum = pVr1.toString() + pVr2.toString();
        }

        return sum;
    }

}
