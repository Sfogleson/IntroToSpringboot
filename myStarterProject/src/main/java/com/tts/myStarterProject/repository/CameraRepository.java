package com.tts.myStarterProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.myStarterProject.model.Camera;

@Repository
public interface CameraRepository extends CrudRepository<Camera, Long> {

}
