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

        User user = new User("bob@bob.com","passord","Bob","Bobberson", true, "bbobberson");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

        user = new User("vbrad@montgomerycollege.edu","resaccess","Veronica","Brad", true, "vbrad");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        user = new User("ofox@yahoo.com","recruit1","Omery","Fox", true, "ofox");
        user.setRoles(Arrays.asList(recruiterRole));
        userRepository.save(user);

        user = new User("nsmith@google.com","recruit2","Nancy","Smith", true, "nsmith");
        user.setRoles(Arrays.asList(recruiterRole));
        userRepository.save(user);
        
        user = new User("ljones@google.com","user1","Larry","Jones", true, "ljones");
        user.setRoles(Arrays.asList(userRole, adminRole));
        userRepository.save(user);
        
        user = new User("mmary@yahoo.com","user2","Mark","Mary", true, "mmary");
        user.setRoles(Arrays.asList(userRole, seekerRole));
        userRepository.save(user);
        
        user = new User("pmanning@google.com","seeker1","Peter","Manning", true, "pmanning");
        user.setRoles(Arrays.asList(seekerRole));
        userRepository.save(user);
        
        user = new User("rturner@comcast.net","seeker2","Robert","Turner", true, "rturner");
        user.setRoles(Arrays.asList(seekerRole));
        userRepository.save(user);
        
        

    }
}
