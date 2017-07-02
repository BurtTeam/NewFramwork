package cn.huida.burt.zsxs.dto;

/**
 * Created by Burt on 2017/7/2 0002.
 */

public class LoginDTO {
    /**
     * acode : 4c0545a402bf998694202ffeb17b6f80
     * Mycode : 1164163
     * username : 15127027086
     * Nickname : 赵
     * Jifen : 593
     * Money : 0
     * xueshi : 0
     * Img :
     * Vip : 0
     * Ktime :
     * Jtime :
     * zcode : 164163
     * Pic : http://www.chinaplat.com/user/UserHeadImg/nopic.gif
     * pwd : e807f1fcf82d132f9bb018ca6738a19f
     */

    /*   用户信息返回码
        {
            "acode":"该用户唯一验证编码",
            "Mycode":"该用户自己的推荐码",
            "username":"用户帐号",
            "Nickname":"昵称",
            "Jifen":"积分余额",
            "Money":"学币余额",
            "xueshi":学识,
            "Img":"备用-暂时无用",
            "Vip":"1或0", （*1为VIP帐号，0为普通帐号）
        "   Ktime":"VIP开通时间",
            "Jtime":"VIP到期时间",
            "zcode":用户ID号,
            "Pic":"头像地址",
            "pwd":"32位密码MD5加密字符串"
        }

   */

    private String acode;
    private String Mycode;
    private String username;
    private String Nickname;
    private String Jifen;
    private String Money;
    private int xueshi;
    private String Img;
    private String Vip;
    private String Ktime;
    private String Jtime;
    private int zcode;
    private String Pic;
    private String pwd;

    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode;
    }

    public String getMycode() {
        return Mycode;
    }

    public void setMycode(String Mycode) {
        this.Mycode = Mycode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getJifen() {
        return Jifen;
    }

    public void setJifen(String Jifen) {
        this.Jifen = Jifen;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }

    public int getXueshi() {
        return xueshi;
    }

    public void setXueshi(int xueshi) {
        this.xueshi = xueshi;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public String getKtime() {
        return Ktime;
    }

    public void setKtime(String Ktime) {
        this.Ktime = Ktime;
    }

    public String getJtime() {
        return Jtime;
    }

    public void setJtime(String Jtime) {
        this.Jtime = Jtime;
    }

    public int getZcode() {
        return zcode;
    }

    public void setZcode(int zcode) {
        this.zcode = zcode;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String Pic) {
        this.Pic = Pic;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




}
