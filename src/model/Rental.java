package model;

import java.util.Calendar;
import java.util.Objects;

public class Rental implements Searchable {
    private Calendar rentDate;
    private Calendar returnDate;
    private RentalStatusEnum status;
    private String carId;

    public Rental() {
    }

    public Rental(final Calendar rentDate, final Calendar returnDate, final RentalStatusEnum status, final String carId) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
        this.carId = carId;
    }

    public Calendar getRentDate() {
        return rentDate;
    }

    public Rental setRentDate(final Calendar rentDate) {
        this.rentDate = rentDate;
        return this;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public Rental setReturnDate(final Calendar returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public RentalStatusEnum getStatus() {
        return status;
    }

    public Rental setStatus(final RentalStatusEnum status) {
        this.status = status;
        return this;
    }

    public String getCarId() {
        return carId;
    }

    public Rental setCarId(final String carId) {
        this.carId = carId;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Rental rental = (Rental) o;
        return Objects.equals(getRentDate(), rental.getRentDate()) && Objects.equals(getReturnDate(), rental.getReturnDate())
                && getStatus() == rental.getStatus() && Objects.equals(getCarId(), rental.getCarId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRentDate(), getReturnDate(), getStatus(), getCarId());
    }

    @Override
    public String toString() {
        return "Rental{" + "rentDate=" + rentDate + ", returnDate=" + returnDate + ", status=" + status + ", carId='" + carId + '\'' + '}';
    }

    @Override
    public boolean contains(final String subString) {
        return this.toString().toLowerCase().contains(subString.toLowerCase());
    }
}
