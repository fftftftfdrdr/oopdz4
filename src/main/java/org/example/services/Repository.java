package org.example.services;

import org.example.Employee;

import java.util.List;

public interface Repository<T, TId> {

    void add(T item);

    void edit(T item);

    void delete(TId id);

    List<T> getAll();

}
