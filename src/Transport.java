public abstract class Transport implements Itransport {
    private final String modelName;
    private  final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
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
     public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
     @Override
     public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
      @Override
      public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check(Transport transport) {
        if (transport.getClass().equals(Car.class)) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        } else if (this.getClass().equals(Bicycle.class)) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }else if (this.getClass().equals(Truck.class)){
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        }
    }
}
