package com.wad.lab3.lab3_wad.services;

import com.wad.lab3.lab3_wad.domain.CareProvider;
import com.wad.lab3.lab3_wad.repositories.CareProviderRepository;

import java.util.List;

public class CareProviderServiceImpl implements CareProviderService {
    private final CareProviderRepository careProviderRepository;

    public CareProviderServiceImpl(CareProviderRepository careProviderRepository) {
        this.careProviderRepository = careProviderRepository;
    }

    @Override
    public CareProvider save(CareProvider careProvider) {
        return careProviderRepository.save(careProvider);
    }

    @Override
    public List<CareProvider> findAll() {
        return (List<CareProvider>) careProviderRepository.findAll();
    }
}
