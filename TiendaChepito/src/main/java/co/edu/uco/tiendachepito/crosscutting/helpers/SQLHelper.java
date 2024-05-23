package co.edu.uco.tiendachepito.crosscutting.helpers;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.tiendachepito.crosscutting.exceptions.custom.CrosscuttingTiendaChepitoException;
import co.edu.uco.tiendachepito.crosscutting.exceptions.messagecatalog.MessageCatalogStrategy;
import co.edu.uco.tiendachepito.crosscutting.exceptions.messagecatalog.data.CodigoMensaje;

public final class SQLHelper {
	
	private SQLHelper() {
		super();
	}
	
	public static final boolean IsNull(final Connection connection) {
		return ObjectHelper.getObjectHelper().isNull(connection);
	}
	
	public static final boolean isOpen(final Connection connection) {
		try {
			return !IsNull(connection) && !connection.isClosed();		
	} catch (final Exception exception) {
		var mensajeUsuario= MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
		var mensajeTecnico= MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00007);
		
		throw new CrosscuttingTiendaChepitoException(mensajeTecnico, mensajeUsuario, exception);
	
	}
		public static final void close(final Connection connection) {
			try {
				if (!isOpen(connection)) {
					var mensajeUsuario = "";
					
					throw new Cros
				}
			}
			
		}
		
		public static final void close(final Connection connection) {		
		}
		

}
}
