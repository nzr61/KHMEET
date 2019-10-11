package com.services;

import com.models.User.UserDTO;
import com.repositorys.UserRepository;
import com.transoformers.UserUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserUserDTO converter;

    public UserDTO getUserByID(Long id) {
        return converter.ConvertToUserDTO(repository.findById(id).get());
    }

    public void save(UserDTO userODT) {
        repository.save(converter.ConvertToUser(userODT));
    }

    public void update(Long id, UserDTO userDTO) {
        UserDTO temp = converter.ConvertToUserDTO(repository.findById(id).get());
        temp.setUser_id(userDTO.getUser_id());
        temp.setEmail(userDTO.getEmail());
        temp.setIs_confirmed(userDTO.getIs_confirmed());
        temp.setPassword(userDTO.getPassword());
        temp.setImage(userDTO.getImage());
        repository.save(converter.ConvertToUser(temp));
    }

    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOList = new ArrayList<>();
        repository.findAll().forEach(a -> userDTOList.add(this.converter.ConvertToUserDTO(a)));
        return userDTOList;
    }

    public UserDTO findUserByEmail(String email)
    {
        return converter.ConvertToUserDTO(repository.findByEmailIgnoreCase(email));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
