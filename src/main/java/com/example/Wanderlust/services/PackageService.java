package com.example.Wanderlust.services;

import com.example.Wanderlust.models.Package;
import com.example.Wanderlust.repositories.PackageRepository;

public class PackageService {
    PackageRepository packageRepository = new PackageRepository();


    public Package getPackageById(long packageId) {
        return packageRepository.getPackageById(packageId);
    }
}
