/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author manuel
 */
public class Response {
    private int _id;
    private String _url;
    private String _response;

    public Response(int _id, String _url, String _response) {
        this._id = _id;
        this._url = _url;
        this._response = _response;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String _url) {
        this._url = _url;
    }

    public String getResponse() {
        return _response;
    }

    public void setResponse(String _response) {
        this._response = _response;
    }
    
    
}
