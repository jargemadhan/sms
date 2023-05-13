package com.sms.Sms;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Component
public class SmsService {

    
    private final String ACCOUNT_SID ="AC54ab1eb25cbaa9ddbeb3dc68b6b99534";

    private final String AUTH_TOKEN = "99b996780113fcba1d5a2f9fcc4915ad";

    private final String FROM_NUMBER = "+12705887672";

    public void send(SmsPojo sms) {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }
}
