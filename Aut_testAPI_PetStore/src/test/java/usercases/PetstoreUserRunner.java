package usercases;

import com.intuit.karate.junit5.Karate;

class PetstoreUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("feature/user","feature/usernegativecases").relativeTo(getClass());
    }
}

