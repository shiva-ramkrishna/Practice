package com.example.demo;

public class Health {
    private String status;

    public Health() {
    }

    public Health(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Health{" +
                "status='" + status + '\'' +
                '}';
    }
}
