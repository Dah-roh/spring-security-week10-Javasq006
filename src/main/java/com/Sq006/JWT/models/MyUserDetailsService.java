package com.Sq006.JWT.models;


import com.Sq006.JWT.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return UserDetailsS.build(userRepository.findByUsername(s)
                .orElseThrow(()-> new UsernameNotFoundException("No such user found")));
    }


//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return new User("JavaSq006", "springsecurity",
//                new ArrayList<>());
//    }
}
