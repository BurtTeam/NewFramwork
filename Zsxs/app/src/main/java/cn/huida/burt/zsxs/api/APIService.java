package cn.huida.burt.zsxs.api;

import cn.huida.burt.zsxs.dto.LoginDTO;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Burt on 2017/7/2 0002.
 */

public interface APIService {

    /*  登陆请求Url
          String url="http://api.chinaplat.com/getval_2017" +
          "?Action=Login&user=13323038757&pwd=e807f1fcf82d132f9bb018ca6738a19f&ip=192.168.56.1";
          方法参数信息
          "Login", "15127027086", "e807f1fcf82d132f9bb018ca6738a19f", "192.168.56.1"

          http://api.chinaplat.com/getval_2017?Action=Login&user=15127027086&pwd=e807f1fcf82d132f9bb018ca6738a19f&ip=192.168.56.1
    */

    @GET("getval_2017")
    Observable<Response<LoginDTO>> GetLoginInfo(@Query("Action") String action,
                                                @Query("user") String user,
                                                @Query("pwd") String pwd,
                                                @Query("ip") String ip
    );




}
