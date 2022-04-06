package com.wad.lab3.lab3_wad.services;

import com.wad.lab3.lab3_wad.domain.CareProvider;

import java.util.List;

public interface CareProviderService {
    CareProvider save(CareProvider careProvider);
    List<CareProvider> findAll();
}
