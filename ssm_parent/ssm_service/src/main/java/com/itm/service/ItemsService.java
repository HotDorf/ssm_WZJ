package com.itm.service;

import com.itm.domain.Items;
import org.springframework.stereotype.Service;


public interface ItemsService {

    Items findById(int id);
}
