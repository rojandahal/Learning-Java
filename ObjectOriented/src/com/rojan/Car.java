package com.rojan;

public class Car {
        private int wheels;
        private int doors;
        private String model;
        public String color;

        public void setModel(String model)
        {
            String validModel = model.toLowerCase();
            if (validModel.equals("carrera") || validModel.equals("commodor")){
                this.model=model;
            }else{
                this.model="Unknowm";
            }
        }
        public String getModel()
        {
            return this.model;
        }

    }
