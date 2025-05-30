public class SearchAvg {
    public <T extends Number> Double avgArray(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        double sum = 0.0;
        for (T element : array) {
            if (element == null) {
                continue;
            }
            sum += element.doubleValue();
        }
        return sum / array.length;
    }
}
