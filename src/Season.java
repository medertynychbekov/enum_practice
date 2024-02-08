public enum Season {

    WINTER(-20, "Кыш мезгили абдан суук"),
    AUTUMN(13, "Куз мезгили жамгырлуу"),
    SUMMER(28,"Жай мезгилинде кун абдан ысык"),
    SPRING(12, "Жаз мезгилинде бираз салкын");

    private int temperature;
    private String description;


    public int getAverageTemperature(){
        return temperature;
    }

    public String getTypicalWeather(){
        return description;
    }

    Season(int temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }
}
