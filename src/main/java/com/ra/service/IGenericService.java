package com.ra.service;

import java.util.List;

public interface IGenericService<T,ID> {
  List<T> findAll();
  T findById(ID id);

T save(T t);
void delete(ID id);





}
