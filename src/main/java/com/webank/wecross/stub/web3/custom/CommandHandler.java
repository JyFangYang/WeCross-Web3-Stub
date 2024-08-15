package com.webank.wecross.stub.web3.custom;

import com.webank.wecross.stub.Account;
import com.webank.wecross.stub.BlockManager;
import com.webank.wecross.stub.Connection;
import com.webank.wecross.stub.Driver;
import com.webank.wecross.stub.Path;

public interface CommandHandler {
  /**
   * handle custom command
   *
   * @param path rule id
   * @param args command args
   * @param account if needs to sign
   * @param blockManager if needs to verify transaction
   * @param connection chain connection
   * @param callback callback
   */
  void handle(
      Path path,
      Object[] args,
      Account account,
      BlockManager blockManager,
      Connection connection,
      Driver.CustomCommandCallback callback);
}
