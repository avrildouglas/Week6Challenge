package com.resume.wk6;

import com.resume.wk6.Role;
/**import com.resume.wk6.persistence.models.User;
import com.resume.wk6.persistence.repositories.RoleRepository;
import com.resume.wk6.persistence.repositories.UserRepository;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner{


    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Loading data . . .");

        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("JOBSEEKER"));
        roleRepository.save(new Role("RECRUITER"));


        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("USER");
        Role seekerRole = roleRepository.findByRole("JOBSEEKER");
        Role recruiterRole = roleRepository.findByRole("RECRUITER");

        User user = new User("bob@bob.com","bob","Bob","Bobberson", true, "bob");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

        user = new User("jim@jim.com","jim","Jim","Jimmerson", true, "jim");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

        user = new User("admin@secure.com","password","Admin","User", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        user = new User("sam@every.com","password","Sam","Everyman", true, "everyman");
        user.setRoles(Arrays.asList(userRole, adminRole));
        userRepository.save(user);
        
        user = new User("ljones@google.com","user1","Larry","Jones", true, "ljones");
        user.setRoles(Arrays.asList(recruiterRole));
        userRepository.save(user);
        
        user = new User("mmary@yahoo.com","user2","Mark","Mary", true, "mmary");
        user.setRoles(Arrays.asList(recruiterRole));
        userRepository.save(user);
        
        user = new User("pmanning@google.com","seeker1","Peter","Manning", true, "pmanning");
        user.setRoles(Arrays.asList(seekerRole));
        userRepository.save(user);
        
        user = new User("pmanning@google.com","seeker1","Peter","Manning", true, "pmanning");
        user.setRoles(Arrays.asList(seekerRole));
        userRepository.save(user);
        
        

    }
}
