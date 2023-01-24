package com.javis.txt.domain.user.admin;

import com.javis.txt.common.util.Sha256Encryptor;
import lombok.*;

import java.security.NoSuchAlgorithmException;

@Setter
@ToString
@Builder
@AllArgsConstructor
public class AdminUserVO {

    private String id;

    private String password;

    public String getId() {
        String result = "";
        try{
            result = Sha256Encryptor.encrypt(this.id);
        }
        catch (NoSuchAlgorithmException e){
            result = "";
        }
        return result;
    }

    public String getPassword(){
        String result = "";
        try{
            result = Sha256Encryptor.encrypt(this.password);
        }
        catch (NoSuchAlgorithmException e){
            result = "";
        }
        return result;
    }

}
