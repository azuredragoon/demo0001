package terence.com.example.webservicedemo.demo0001.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import terence.com.example.webservicedemo.demo0001.service.UserService;

/**
 * Created by terence pan on 10/5/2017.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
}
