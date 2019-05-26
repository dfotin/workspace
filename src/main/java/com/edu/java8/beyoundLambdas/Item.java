package com.edu.java8.beyoundLambdas;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Ukropchik on 02.07.2017.
 */
public class Item {
    private final Long id;
    private final int pos;

    public Item(Long id, int pos) {
        this.id = id;
        this.pos = pos;
    }

    public Long getId() {
        return id;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return new EqualsBuilder()
                .append(pos, item.pos)
                .append(id, item.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(pos)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", pos=" + pos +
                '}';
    }

}
