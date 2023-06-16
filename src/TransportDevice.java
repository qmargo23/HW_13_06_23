public abstract class TransportDevice implements Serviceable{
    private final String modelName;
    private  final int wheelsCount;

    public TransportDevice(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + getModelName());
    }
}
