public enum TemperatureConvert {

    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn * 9.0F / 5.0F + 32.0F;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15F;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15F;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32.0F) * 5.0F / 9.0F;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32.0F) * 5.0F / 9.0F + 273.15F;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273.15F) * 9.0F / 5.0F + 32.0F;
        }
    });

    char input;
    char output;
    Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperature(char input, char output, float temp){
        for (TemperatureConvert temperatureConvert :
                values()) {
            if (temperatureConvert.input == input && temperatureConvert.output == output){
                return temperatureConvert.converter.convert(temp);
            }
        }
        return Integer.MAX_VALUE;
    }
}
